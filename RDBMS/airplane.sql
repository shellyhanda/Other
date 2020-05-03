CREATE TABLE airplane (
    airplane_id INT AUTO_INCREMENT PRIMARY KEY,
    facility VARCHAR(50),
    mac_no VARCHAR(50),
	model VARCHAR(50)
);
select * from airplane;
insert into airplane(facility,mac_no,model) values("seattle","1","777");

select facility from airplane where airplane_id=1;
CALL `employee`.`get_airplane`(1, @name);
select(@name)