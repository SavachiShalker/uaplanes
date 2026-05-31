INSERT INTO city (city_id, display_name) VALUES
                                             ('city-1', 'Kyiv'),
                                             ('city-2', 'Lviv'),
                                             ('city-3', 'Odesa'),
                                             ('city-4', 'Kharkiv');

INSERT INTO user_profile (user_profile_id, first_name, last_name, username, password) VALUES
                                                                                          ('user-1', 'Ivan', 'Petrenko', 'ivan_p', 'pass123'),
                                                                                          ('user-2', 'Olena', 'Kovalenko', 'olena_k', 'pass456');

INSERT INTO flight (flight_id, flight_number, departure_city_id, arrival_city_id, departure_time, arrival_time, price) VALUES
                                                                                                                           ('flight-1', 'UA101', 'city-1', 'city-2', '2025-06-01 08:00:00+00', '2025-06-01 09:30:00+00', 1500),
                                                                                                                           ('flight-2', 'UA202', 'city-2', 'city-3', '2025-06-01 11:00:00+00', '2025-06-01 13:00:00+00', 1800),
                                                                                                                           ('flight-3', 'UA303', 'city-1', 'city-4', '2025-06-02 07:00:00+00', '2025-06-02 08:30:00+00', 1200);

INSERT INTO ticket (ticket_id, flight_id, user_profile_id, pnr) VALUES
                                                                    ('ticket-1', 'flight-1', 'user-1', 'PNR001'),
                                                                    ('ticket-2', 'flight-2', 'user-2', 'PNR002'),
                                                                    ('ticket-3', 'flight-3', 'user-1', 'PNR003');