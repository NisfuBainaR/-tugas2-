SELECT film.title AS film_title, language.name AS language_name
FROM film
JOIN language ON film.language_id = language.language_id;