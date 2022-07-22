CREATE TABLE demodb.demonstration_object( 
    do_id int not null auto_increment primary key, 
    do_name varchar(255) not null
    ); 
INSERT INTO demodb.demonstration_object(do_name)VALUES('init test insert');
DROP TABLE demodb.demonstration_object;
SELECT * FROM demodb.demonstration_object; 