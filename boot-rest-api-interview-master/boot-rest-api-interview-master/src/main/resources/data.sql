insert into book
(title,isbn,author,category)
values('Java','1234','Jame Stone','Coding Book');

insert into book
(title,isbn,author,category)
values('Python','123456','Zatiah Abdul','How to code in Python');

insert into borrower
(email,first_name,last_name,phone_no)
values('luv2code@gmail.com','Mason','Mount','60102075614');

insert into borrower
(email,first_name,last_name,phone_no)
values('happycoding@gmail.com','Collins','James','60182927410');

insert into shopping_cart
(borrower_id,book_id)
values(1,2);

insert into shopping_cart
(borrower_id,book_id)
values(2,1);