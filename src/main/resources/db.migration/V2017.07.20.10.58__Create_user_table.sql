CREATE TABLE user_profile (
	id serial NOT NULL,
	email varchar(255) NOT NULL,
	password_hash varchar(255) NOT NULL,
	role varchar(255) NOT NULL,
	enabled boolean NOT NULL DEFAULT FALSE
);

ALTER TABLE ONLY user_profile ADD CONSTRAINT users_pkey PRIMARY KEY(id);