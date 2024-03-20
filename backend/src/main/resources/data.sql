select * from hello where hello_id = 1;

if (@@ROWCOUNT = 0)
begin
    insert into hello
    values ('Hello from the other side (Our database)')
end;