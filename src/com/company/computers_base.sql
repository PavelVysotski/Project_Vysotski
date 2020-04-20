CREATE TYPE type AS ENUM ('WORK', 'HOME', 'GAMER');

CREATE TABLE computers(
   id SERIAL PRIMARY KEY,
   option_numb VARCHAR (50) UNIQUE NOT NULL,
   comp_type type NOT NULL,
   processor VARCHAR (50) NOT NULL,
   ram_gb INTEGER NOT NULL,
   hdd_gb INTEGER NOT NULL,
   ssd_gb INTEGER,
   videocard VARCHAR (50) NOT NULL,
   monitor_inch VARCHAR (50) NOT NULL,
   price INTEGER NOT NULL,
   created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
   updated_at TIMESTAMP
);

INSERT INTO computers (option_numb, comp_type, processor, ram_gb, hdd_gb, ssd_gb, videocard, monitor_inch, price, updated_at) VALUES ('Вариант 1', 'WORK', 'Intel Pentium G5400', 8, 1000, 0, 'встроенная', 'Samsung 21', 650, NULL);
INSERT INTO computers (option_numb, comp_type, processor, ram_gb, hdd_gb, ssd_gb, videocard, monitor_inch, price, updated_at) VALUES ('Вариант 2', 'WORK', 'Intel Core i3-8100', 8, 1000, '240', 'встроенная', 'Samsung 21', 870, NULL);
INSERT INTO computers (option_numb, comp_type, processor, ram_gb, hdd_gb, ssd_gb, videocard, monitor_inch, price, updated_at) VALUES ('Вариант 3', 'HOME', 'Intel Core i3-8100', 8, 1000, 0, 'GeForce 750GT 2Gb', 'Philips 24', 1230, NULL);
INSERT INTO computers (option_numb, comp_type, processor, ram_gb, hdd_gb, ssd_gb, videocard, monitor_inch, price, updated_at) VALUES ('Вариант 4', 'HOME', 'Intel Core i3-8100', 16, 1000, '240', 'GeForce 750GT 2Gb', 'Philips 24', 1440, NULL);
INSERT INTO computers (option_numb, comp_type, processor, ram_gb, hdd_gb, ssd_gb, videocard, monitor_inch, price, updated_at) VALUES ('Вариант 5', 'HOME', 'Intel Core i5-8400', 16, 1000, '240', 'ATI R5 230 2Gb', 'LG 24', 1610, NULL);
INSERT INTO computers (option_numb, comp_type, processor, ram_gb, hdd_gb, ssd_gb, videocard, monitor_inch, price, updated_at) VALUES ('Вариант 6', 'GAMER', 'Intel Core i7-9700KF', 32, 1000, '480', 'ATI RX 5700 XT 8Gb', 'Philips 27', 3900, NULL);
INSERT INTO computers (option_numb, comp_type, processor, ram_gb, hdd_gb, ssd_gb, videocard, monitor_inch, price, updated_at) VALUES ('Вариант 7', 'GAMER', 'Intel Core i9-9900KF', 32, 2000, '1000', 'GF RTX 2070 SUPER 8Gb', 'Philips 27', 4500, NULL);

CREATE TABLE customers(
   id SERIAL PRIMARY KEY,
   company VARCHAR (50) UNIQUE NOT NULL,
   contact_person VARCHAR (50) NOT NULL,
   phone VARCHAR (50) NOT NULL,
   created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
   updated_at TIMESTAMP
);

INSERT INTO customers (company, contact_person, phone, updated_at) VALUES ('ОАО "АСБ Лизинг"', 'Сергей', '8-029-111-11-11', NULL);
INSERT INTO customers (company, contact_person, phone, updated_at) VALUES ('УП "Нефтехимпроект"', 'Павел', '8-029-222-22-22', NULL);
INSERT INTO customers (company, contact_person, phone, updated_at) VALUES ('ОАО "Белагропромбанк"', 'Андрей Мороз', '8-029-333-33-33', NULL);
INSERT INTO customers (company, contact_person, phone, updated_at) VALUES ('ЗАО "Август Бел"', 'Алексей', '8-029-444-44-44', NULL);

CREATE TABLE orders(
   id SERIAL PRIMARY KEY,
   customer_id SMALLINT REFERENCES customers (ID) NOT NULL,
   computer_id SMALLINT REFERENCES computers (ID) NOT NULL,
   count SMALLINT NOT NULL,
   total_cost INTEGER NOT NULL,
   created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
   updated_at TIMESTAMP
);

INSERT INTO orders (customer_id, computer_id, count, total_cost) VALUES ('1', '2', '4', '3480');
INSERT INTO orders (customer_id, computer_id, count, total_cost) VALUES ('2', '5', '2', '3220');
INSERT INTO orders (customer_id, computer_id, count, total_cost) VALUES ('3', '3', '7', '8610');
INSERT INTO orders (customer_id, computer_id, count, total_cost) VALUES ('4', '1', '5', '3250');

