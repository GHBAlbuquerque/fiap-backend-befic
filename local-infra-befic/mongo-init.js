//var db = connect("mongodb://admin:password@localhost:27017/admin");

db = db.getSiblingDB('db-befic');

db.createUser(
    {
        user: "admin",
        pwd: "password",
        roles: [
            {
                role: "readWrite",
                db: "db-befic"
            }
        ]
    }
)

db.createCollection("followers");
db.createCollection("following");