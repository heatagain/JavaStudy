create table bigmember(
	id varchar2(500),
	pw varchar2(500),
	nick varchar2(500)
)

insert into bigmember (id, pw, nick)
values ('coco', 'q123', 'dsss');

insert into bigmember (id, pw, nick)
values ('pbk', '1234', 'ȣ�ξƺ�');

select * from bigmember

select nick from bigmember