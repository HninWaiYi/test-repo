-- Passenger
INSERT INTO passenger_tbl ( name, phone) VALUES( 'John Doe', '0911111111'); 
INSERT INTO passenger_tbl ( name, phone) VALUES( 'Alice Smith', '0922222222'); 
INSERT INTO passenger_tbl ( name, phone) VALUES( 'Bob Johnson', '0933333333');
INSERT INTO passenger_tbl (name, phone) VALUES ('Emma Wilson', '0944444444');
INSERT INTO passenger_tbl (name, phone) VALUES ('James Taylor', '0955555555');
INSERT INTO passenger_tbl (name, phone) VALUES ('Sophia Davis', '0966666666');
INSERT INTO passenger_tbl (name, phone) VALUES ('William Miller', '0977777777');
INSERT INTO passenger_tbl (name, phone) VALUES ('Olivia Anderson', '0988888888');
INSERT INTO passenger_tbl (name, phone) VALUES ('Noah Thomas', '0999999999');

--Address
INSERT INTO address_tbl (state, township, street) VALUES( 'Yangon', 'Innsein', 'Kamayut');
INSERT INTO address_tbl (state, township, street) VALUES( 'Yangon', 'Innsein', 'Hlaetan');

-- Driver
INSERT INTO driver_tbl (name, dob, nrc, address_id) VALUES( 'David Brown', '1985-05-10', '12/ABC(N)123456', 1);
INSERT INTO driver_tbl (name, dob, nrc, address_id) VALUES( 'Michael Lee', '1990-08-20', '13/DEF(N)654321', 2);
INSERT INTO driver_tbl (name, dob, nrc, address_id) VALUES( 'Joe', '1992-03-21', '13/DEF(N)653322', null);


-- Driver Licence
INSERT INTO driver_licence_tbl(driver_id, number, issueDate, validDate, bloodType, licenceType)VALUES(1, 'DL-10001', '2022-01-01', '2027-01-01', 'A', 'B');
INSERT INTO driver_licence_tbl(driver_id, number, issueDate, validDate, bloodType, licenceType)VALUES(2, 'DL-10002', '2023-02-15', '2028-02-15', 'B', 'C');

-- Car
INSERT INTO car_tbl (brand, model) VALUES('Toyota', 'Corolla');
INSERT INTO car_tbl (brand, model) VALUES('Honda', 'Civic');

-- Car Licence
INSERT INTO car_licence_tbl(car_id, number, issueDate, validDate)VALUES(1, 'YGN-5A-1234', '2024-01-01', '2025-12-31');
INSERT INTO car_licence_tbl(car_id, number, issueDate, validDate)VALUES(2, 'MDY-7B-5678', '2024-03-01', '2026-02-28');

-- Trip
INSERT INTO trip_tbl (pickupPoint, dropOffPoint, tripDate, tripTime, cost)VALUES('Yangon Airport', 'Sule Pagoda', '2026-01-01', '09:10:11', 15000);
INSERT INTO trip_tbl (pickupPoint, dropOffPoint, tripDate, tripTime, cost)VALUES( 'Mandalay Hill', 'Mandalay Palace', '2026-01-01', '12:20:11', 10000);
INSERT INTO trip_tbl (pickupPoint, dropOffPoint, tripDate, tripTime, cost)VALUES ('Shwedagon Pagoda', 'Yangon Central Station', '2026-01-21', '10:31:00', 12000);
INSERT INTO trip_tbl (pickupPoint, dropOffPoint, tripDate, tripTime, cost)VALUES ('Inya Lake', 'Junction Square', '2026-01-22', '09:10:00', 8000);
INSERT INTO trip_tbl (pickupPoint, dropOffPoint, tripDate, tripTime, cost)VALUES ('Aung Mingalar Bus Station', 'Yangon Airport', '2026-01-23', '12:20:11', 18000);
INSERT INTO trip_tbl (pickupPoint, dropOffPoint, tripDate, tripTime, cost)VALUES ('Mandalay Palace', 'U Bein Bridge', '2026-01-25', '02:22:30', 20000);
INSERT INTO trip_tbl (pickupPoint, dropOffPoint, tripDate, tripTime, cost)VALUES ('Pyin Oo Lwin Market', 'National Kandawgyi Gardens', '2026-01-25', '05:11:22', 15000);
INSERT INTO trip_tbl (pickupPoint, dropOffPoint, tripDate, tripTime, cost)VALUES ('Bagan Archaeological Zone', 'Nyaung U Airport', '2026-01-27', '09:44:00', 25000);

-- Trip Detail
INSERT INTO trip_detail_tbl(passenger_id, trip_id, car_licence_id, driver_licence_id, qty, status)VALUES(1, 1, 'YGN-5A-1234', 'DL-10001', 1, 'COMPLETED');
INSERT INTO trip_detail_tbl(passenger_id, trip_id, car_licence_id, driver_licence_id, qty, status)VALUES(2, 1, 'YGN-5A-1234', 'DL-10001', 2, 'COMPLETED');
INSERT INTO trip_detail_tbl(passenger_id, trip_id, car_licence_id, driver_licence_id, qty, status)VALUES(3, 2, 'MDY-7B-5678', 'DL-10002', 1, 'PENDING');
INSERT INTO trip_detail_tbl(passenger_id, trip_id, car_licence_id, driver_licence_id, qty, status)VALUES (4, 2, 'YGN-5A-1234', 'DL-10001', 1, 'COMPLETED');
INSERT INTO trip_detail_tbl(passenger_id, trip_id, car_licence_id, driver_licence_id, qty, status)VALUES (5, 3, 'YGN-5A-1234', 'DL-10001', 2, 'COMPLETED');
INSERT INTO trip_detail_tbl(passenger_id, trip_id, car_licence_id, driver_licence_id, qty, status)VALUES (6, 5, 'MDY-7B-5678', 'DL-10002', 1, 'PENDING');
INSERT INTO trip_detail_tbl(passenger_id, trip_id, car_licence_id, driver_licence_id, qty, status)VALUES (7, 6, 'MDY-7B-5678', 'DL-10002', 3, 'COMPLETED');
INSERT INTO trip_detail_tbl(passenger_id, trip_id, car_licence_id, driver_licence_id, qty, status)VALUES (8, 7, 'YGN-5A-1234', 'DL-10001', 1, 'ONDRIVE');
INSERT INTO trip_detail_tbl(passenger_id, trip_id, car_licence_id, driver_licence_id, qty, status)VALUES (9, 8, 'MDY-7B-5678', 'DL-10002', 2, 'ONDRIVE');