ALTER TABLE employees
ADD CONSTRAINT FK_employee_manager
FOREIGN KEY (manager_id)
REFERENCES employees (employee_id)
ON DELETE SET NULL;