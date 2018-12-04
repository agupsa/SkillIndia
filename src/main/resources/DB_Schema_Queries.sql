CREATE TABLE GR5_CANDIDATE
(
gc_reg_no NUMBER(5) PRIMARY KEY,    //not null
gc_name VARCHAR2(30),
gc_gender VARCHAR2(10),
gc_dob DATE,
gc_username VARCHAR2(30) UNIQUE,
gc_pass VARCHAR2(1000),				//not null
gc_contact_no NUMBER(10) UNIQUE,
gc_aadhar_no NUMBER(12) UNIQUE,
gc_father_name VARCHAR2(30),
gc_qualification VARCHAR2(30),
gc_college_name VARCHAR2(30),
gc_marks NUMBER(6,2),
gc_photo VARCHAR2(1000),			//not null
gc_aadhar_card VARCHAR2(1000),		//not null
gc_edu_certi VARCHAR2(1000),		//not null
gc_status VARCHAR2(50)
);
---------------------------------------
create sequence GR5_CANDIDATE_seq
start with 101
increment by 1
nocycle;
-----------------------------------------

CREATE TABLE GR5_establishment
( 
ge_regno NUMBER(5) PRIMARY KEY, 	//not null
ge_est_name VARCHAR2(30), 
ge_email VARCHAR2(30) UNIQUE,
ge_pass VARCHAR2(1000),				//not null
ge_industry_type VARCHAR2(30),
ge_no_of_emp NUMBER(5),
ge_workdays NUMBER(1),
ge_name_of_head VARCHAR2(30),
ge_contact_no NUMBER(10) UNIQUE,
ge_bank_name VARCHAR2(30),
ge_IFSC_code VARCHAR2(30),
ge_account_no NUMBER(30) UNIQUE,
ge_status VARCHAR2(30),
ge_tin NUMBER,
ge_proof VARCHAR2(1000)
);

-----------------------------------------

create sequence GR5_establishment_seq
start with 101
increment by 1
nocycle;

-------------------------------------------------

CREATE TABLE GR5_ADDRESS
(
ga_addr_id NUMBER(5) PRIMARY KEY,		//not null
ga_addr VARCHAR2(30),
ga_state VARCHAR2(30),
ga_city VARCHAR2(30),
ga_pincode NUMBER(15),
ga_gc_reg_no NUMBER(5),
ga_ge_regno NUMBER(5) ,
);
---------------------------------------------
create sequence GR5_address_seq
start with 101
increment by 1
nocycle;

----------------------------------------------
ALTER TABLE GR5_ADDRESS ADD CONSTRAINT GA_FKCAN FOREIGN KEY (GA_GC_REG_NO) REFERENCES GR5_CANDIDATE(GC_REG_NO) ON DELETE CASCADE; 
ALTER TABLE GR5_ADDRESS ADD CONSTRAINT GA_FKEST FOREIGN KEY (GA_GE_REGNO) REFERENCES GR5_ESTABLISHMENT(GE_REGNO) ON DELETE CASCADE; 
----------------------------------------------------------------------------------------------------------------------------------------

CREATE TABLE GR5_COURSES
(
gco_course_id NUMBER(5) PRIMARY KEY,	//not null
gco_course_name VARCHAR2(30),
gco_trainer_name VARCHAR2(30),
gco_trainer_contact_no NUMBER(10),
gco_domain_name VARCHAR2(30),
gco_ge_regno NUMBER(5),
gco_ge_name NUMBER(5)			//not null
);
--------------------------------------------------------------------------------

ALTER TABLE GR5_COURSES ADD CONSTRAINT GA_COURSEFKEST FOREIGN KEY (GCO_GE_REGNO) REFERENCES GR5_ESTABLISHMENT(GE_REGNO) ON DELETE CASCADE;  

-------------------------------------------------------------------------------
create sequence GR5_course_seq
start with 101
increment by 1
nocycle;
----------------------------------------------------


create table GR5_CONTRACT
(
gof_letter_no NUMBER(5),
gof_gc_reg_no NUMBER(5),
gof_ge_regno NUMBER(5), 
gof_ge_est_name VARCHAR2(30), 
gof_gco_course_id NUMBER(5),
gof_stipend NUMBER(10),
gof_start_date DATE,
gof_end_date DATE,
gof_status VARCHAR2(30),
gof_contract VARCHAR2(1000)
);

---------------------------------------------------------------------------------
create sequence GR5_contract_seq
start with 1
increment by 1
nocycle;
---------------------------------------------------------------------------------

ALTER TABLE GR5_CONTRACT ADD CONSTRAINT GA_CONFKCAN FOREIGN KEY (GOF_GC_REG_NO) REFERENCES GR5_CANDIDATE(GC_REG_NO) ON DELETE CASCADE;
ALTER TABLE GR5_CONTRACT ADD CONSTRAINT GA_CONFKEST FOREIGN KEY (GOF_GE_REGNO) REFERENCES GR5_ESTABLISHMENT(GE_REGNO) ON DELETE CASCADE;  
ALTER TABLE GR5_CONTRACT ADD CONSTRAINT GA_CONFKCOURSE FOREIGN KEY (GOF_GCO_COURSE_ID) REFERENCES GR5_COURSES(GCO_COURSE_ID) ON DELETE CASCADE;
---------------------------------------------------------------------------------









