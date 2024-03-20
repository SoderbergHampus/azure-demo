insert into hello
values (2, 'Hello from the other side (Our database)')
on conflict do nothing;
