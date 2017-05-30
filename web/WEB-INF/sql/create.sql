CREATE TABLE USERS (
    USERNAME VARCHAR(16) UNIQUE,
    PASSWORD VARCHAR(20) NOT NULL,
    FIRSTNAME VARCHAR(20),
    LASTNAME VARCHAR(30),
    EMAIL VARCHAR(50),
    JOINDATE DATE NOT NULL DEFAULT CURRENT_DATE,
	ID INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY
);

CREATE TABLE POSTS (
    AUTHOR INTEGER NOT NULL REFERENCES USERS(ID),
    CONTENT VARCHAR(255) NOT NULL,
    JOINDATE DATE NOT NULL DEFAULT CURRENT_DATE,
    ID INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY
);