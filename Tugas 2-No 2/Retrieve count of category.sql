SELECT category.name AS category_name, COUNT(film_category.film_id) AS film_count
FROM category
LEFT JOIN film_category ON category.category_id = film_category.category_id
GROUP BY category_name
ORDER BY film_count DESC;
