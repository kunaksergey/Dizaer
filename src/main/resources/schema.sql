CREATE DATABASE IF NOT EXISTS dizaer
  CHARACTER SET utf8
  COLLATE utf8_general_ci;
USE dizaer;

CREATE TABLE IF NOT EXISTS intro (
  NAME VARCHAR(150) NOT NULL,
  POSTER_NAME VARCHAR (150),
  DESCRIPTION VARCHAR (255),
  VIDEO_NAME VARCHAR (150),
  PRIMARY KEY (NAME)
)
  ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS intro_details (
  ID INT NOT NULL AUTO_INCREMENT,
  INTRO_ID VARCHAR(150) NOT NULL,
  DOWNLOAD_LINK VARCHAR(255),
  CLIENT VARCHAR(255),
  DUAL_ VARCHAR(150),
  DATE_MADE VARCHAR(10),
  LIGHT_ROOM VARCHAR(150),
  CC VARCHAR(150),
  SONG VARCHAR(150),
  SONG_LINK VARCHAR(150),
  FONT VARCHAR(150),
  LETTER_PACK VARCHAR(150),
  MATS VARCHAR(150),
  SHAKE VARCHAR(150),
  STYLE VARCHAR(150),
  INSPIRATIONS VARCHAR(150),
  SHOCKWAVES VARCHAR(150),
  OBJ VARCHAR(150),
  OTHER VARCHAR(150),
  RENDER_OPTION VARCHAR(150),
  WORK_TIME VARCHAR(150),
  RENDER_TIME VARCHAR(150),
  QUALITY VARCHAR(150),
  PROGRAM_USED VARCHAR(150),
  FORMAT VARCHAR(150),
  FOREIGN KEY (INTRO_ID) REFERENCES intro (NAME),
  PRIMARY KEY (id)
)
  ENGINE = InnoDB;