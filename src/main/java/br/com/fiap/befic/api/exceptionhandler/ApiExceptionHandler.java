package br.com.fiap.befic.api.exceptionhandler;

import br.com.fiap.befic.domain.exception.BusinessEntityNotFoundException;
import br.com.fiap.befic.domain.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.OffsetDateTime;
import java.util.ArrayList;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    @Autowired
    private MessageSource messageSource;

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatus status, WebRequest request) {
        var campos = new ArrayList<BusinessErrorField>();

        ex.getBindingResult().getAllErrors()
                .stream()
                .map(error -> (FieldError) error)
                .forEach(error -> campos.add
                        (new BusinessErrorField(error.getField(),
                                messageSource.getMessage(error, LocaleContextHolder.getLocale()))));


        var businessErrorMessage = new BusinessErrorMessage();
        businessErrorMessage.setStatus(status.value());
        businessErrorMessage.setDatahora(OffsetDateTime.now());
        businessErrorMessage.setMensagem("Um ou mais campos estão fora do padrão correto!");
        businessErrorMessage.setCampos(campos);

        return handleExceptionInternal(ex, businessErrorMessage, headers, status, request);
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<Object> handleBusinessException(BusinessException ex, WebRequest request) {

        var status = HttpStatus.BAD_REQUEST;

        var businessErrorMessage = new BusinessErrorMessage();
        businessErrorMessage.setStatus(status.value());
        businessErrorMessage.setDatahora(OffsetDateTime.now());
        businessErrorMessage.setMensagem(ex.getMessage());

        return handleExceptionInternal(ex, businessErrorMessage, new HttpHeaders(), status, request);

    }

    @ExceptionHandler(BusinessEntityNotFoundException.class)
    public ResponseEntity<Object> handleEntityNotFoundException(BusinessException ex, WebRequest request) {

        var status = HttpStatus.NOT_FOUND;

        var businessErrorMessage = new BusinessErrorMessage();
        businessErrorMessage.setStatus(status.value());
        businessErrorMessage.setDatahora(OffsetDateTime.now());
        businessErrorMessage.setMensagem(ex.getMessage());

        return handleExceptionInternal(ex, businessErrorMessage, new HttpHeaders(), status, request);

    }


}
