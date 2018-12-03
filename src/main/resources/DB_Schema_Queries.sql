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
/*CONSTRAINT candidate_fk foreign key (ga_gc_reg_no) references GR5_candidate (gc_reg_no) ON DELETE CASCADE,*/
ga_ge_regno NUMBER(5) ,
/*CONSTRAINT establishment_fk foreign key (ga_ge_regno) references GR5_establishment (ge_regno)
) ON DELETE CASCADE*/
);
---------------------------------------------
create sequence GR5_address_seq
start with 101
increment by 1
nocycle;

----------------------------------------------

/*CREATE TABLE GR5_VERIFICATION_DETAILS
(
gvd_verification_id NUMBER(5) PRIMARY KEY,
gvd_training_years NUMBER(5),
gvd_trainee_no NUMBER(5),
gvd_placed_no NUMBER(5),
gvd_tin_no NUMBER(20),
gvd_turnover NUMBER(5),
gvd_networth NUMBER(20),
gvd_ge_regno NUMBER(5),
/*foreign key (gvd_ge_regno) references GR5_establishment (ge_regno)*/
)ON DELETE CASCADE;
----------------------------------------------------------------

create sequence GR5_verification_details_seq
start with 101
increment by 1
nocycle;
------------------------------------------------
CREATE TABLE GR5_DOMAIN
(
gd_domain_id NUMBER(5) PRIMARY KEY,
gd_domain_name VARCHAR2(30)
);
----------------------------

create sequence GR5_domain_seq
start with 101
increment by 1
nocycle;
*/
----------------------------------------

CREATE TABLE GR5_COURSES
(
gco_course_id NUMBER(5) PRIMARY KEY,	//not null
gco_course_name VARCHAR2(30),
gco_trainer_name VARCHAR2(30),
gco_trainer_contact_no NUMBER(10),
gco_domain_name VARCHAR2(30),
gco_ge_regno NUMBER(5),
gco_ge_name NUMBER(5)			//not null
/*,				
FOREIGN KEY (gco_domain_id)REFERENCES GR5_DOMAIN(gd_domain_id) ON DELETE CASCADE,
FOREIGN KEY (gco_ge_regno)REFERENCES GR5_establishment(ge_regno) ON DELETE CASCADE,
FOREIGN KEY (gco_ge_name)REFERENCES GR5_establishment(ge_est_name) ON DELETE CASCADE*/
);
--------------------


create sequence GR5_course_seq
start with 101
increment by 1
nocycle;
----------------------------------------


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
/*,
foreign key (gof_gc_reg_no) references GR5_candidate (gc_regno) ON DELETE CASCADE,
foreign key (gof_ge_regno) references GR5_establishment (ge_ge_regno) ON DELETE CASCADE,
foreign key (gof_ge_est_name) references GR5_establishment (ge_est_name) ON DELETE CASCADE,
foreign key (gof_gco_course_id) references GR5_course (gco_course_id) ON DELETE CASCADE,
foreign key (gof_gc_reg_no) references GR5_CANDIDATE (gc_regno) ON DELETE CASCADE*/
);

--------------------------
create sequence GR5_contract_seq
start with 1
increment by 1
nocycle;


----------------------


/*CREATE TABLE GR5_ENROLLED_USER
(
geu_ENROLL_ID NUMBER(20) PRIMARY KEY,
geu_contract_id NUMBER(20),
FOREIGN KEY(geu_contract_id) REFERENCES GR5_offerletter(gof_contract_id),
gc_reg_no VARCHAR2(20),
foreign key (geu_reg_no) references GR5_candidate (gc_reg_no),
geu_STATUS VARCHAR2(30)
);
-------------------------------------

create sequence GR5_enrolled_user_seq
start with 1
increment by 1
nocycle;*/

insert into gr5_establishment values(gr5_establishment_seq.nextval,'abc','email','pass','it',500,5,'head',9876543210,'sbi','SBI0096',5566,'Awaiting verification');

insert into gr5_establishment values(gr5_establishment_seq.nextval,'xyz','email1','pass','it',500,6,'head1',9976543210,'sbi','SBI0096',5567,'Awaiting verification');





