CREATE USER 'redditDB' @'localhost' IDENTIFIED BY 'redditclone';
GRANT ALL PRIVILEGES ON *.* TO 'redditDB' @'localhost';
FLUSH PRIVILEGES;