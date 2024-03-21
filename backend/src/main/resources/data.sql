-- select * from hello where hello_id = 1;
--
-- if (@@ROWCOUNT = 0)
-- begin
--     insert into hello
--     values ('Hello from the other side (Our database)')
-- end;

-- select * from dog where id = 1;
--
-- if (@@ROWCOUNT = 0)
-- begin
insert into dog (name, description, img_ref)
values ('Elsa', 'A small, stubborn, and lovely old lady',
        'https://svenskanorfolkterrierklubben.se/wp-content/uploads/irenes1.jpg');

insert into dog (name, description, img_ref)
values ('Wilma', 'A small, dumber, less stubborn old lady',
        'https://svenskanorfolkterrierklubben.se/wp-content/uploads/irenes1.jpg');
-- end;

