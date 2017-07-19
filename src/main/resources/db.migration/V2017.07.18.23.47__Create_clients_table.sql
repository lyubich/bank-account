CREATE TABLE bank_account(
	id serial NOT NULL,
	account_number int NOT NULL,
	client_surname varchar(128) NOT NULL,
	client_name varchar(128) NOT NULL,
	client_patronymic varchar(128),
	balance int NOT NULL DEFAULT 0,
	currency varchar(128) NOT NULL
);

ALTER TABLE ONLY bank_account ADD CONSTRAINT bank_account_pkey PRIMARY KEY(id);