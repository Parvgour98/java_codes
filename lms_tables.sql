use mlp203;

create table employee_details(
	empId int,
    empName varchar(50),
    emailId varchar(50),
    phone varchar(10),
    date_of_joining date,
    leave_bal int,
    mgrId int,
    foreign key(mgrId) references employee_details(empId),
    primary key(empId));

create table leave_details(
	leaveId int auto_increment primary key,
    empId int,
    total_leaves int,
    start_date date,
    end_date date,
    leave_type enum('EL','SL','ML'),
    leave_status enum('APPROVED','DENIED','PENDING'),
    reason varchar(50),
    applied_on date,
    comments varchar(255) null,
    foreign key(empId) references employee_details(empId));
    
    
drop table employee_details;