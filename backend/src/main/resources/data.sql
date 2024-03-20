insert into hello
values (1, 'Hello from the other side (Our database)')
on conflict do nothing;
