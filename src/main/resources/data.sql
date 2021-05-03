INSERT IGNORE INTO SP_USER ('id', 'username', 'password', 'algorithm') VALUES ('1', 'john', '$2a$10$xn3LI/AjqicFYZFruSwve.681477XaVNaUQbr1gioaWPn4t1KsnmG', 'BCRYPT');

INSERT IGNORE INTO SP_AUTHORITY ('id', 'name', 'user') VALUES ('1', 'READ', '1');
INSERT IGNORE INTO SP_AUTHORITY ('id', 'name', 'user') VALUES ('2', 'WRITE', '1');

INSERT IGNORE INTO SP_PRODUCT ('id', 'name', 'price', 'currency') VALUES ('1', 'Chocolate', '10', 'USD');