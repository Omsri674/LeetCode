with counts as
(
    select class, count(student) as counting from Courses group by class
)
select class from counts where counting >= 5