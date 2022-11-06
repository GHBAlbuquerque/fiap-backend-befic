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

db.followers.insertMany([
    {
            userId: 1,
            followerId: 2,
            followerUsername: "dai-san"
    },
    {
            userId: 1,
            followerId: 3,
            followerUsername: "tannor_1"
    },
    {
            userId: 2,
            followerId: 4,
            followerUsername: "yasescreve"
    },
    {
            userId: 4,
            followerId: 2,
            followerUsername: "dai-san"
    },
    {
            userId: 4,
            followerId: 3,
            followerUsername: "tannor_1"
    }
]);

db.following.insertMany([
    {
            userId: 3,
            followingId: 1,
            followingUsername: "nejihinax"
    },
    {
            userId: 4,
            followingId: 2,
            followingUsername: "dai-san"
    },
    {
            userId: 3,
            followingId: 4,
            followingUsername: "yasescreve"
    },
    {
            userId: 2,
            followingId: 1,
            followingUsername: "nejihinax"
    },
    {
            userId: 2,
            followingId: 4,
            followingUsername: "yasescreve"
    }
]);
