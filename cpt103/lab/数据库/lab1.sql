USE schema_name;
-- 创建表格 输入表头
CREATE TABLE `teachers`
(
    `id` int, -- we will add primary key later. NOT NULL and UNIQUE is not needed.
    `name` varchar(200) not null,
    `tel_no` varchar(40),  -- not using INT here as we have numbers like +44
    `office` varchar(15) not null
);
CREATE TABLE `modules`
(
   code varchar(10),
   title varchar(100) not null,
   `teacher_id` int
);
CREATE TABLE student
(
     id int(6),
     `name` varchar(200) not null ,
    `email` varchar(100) not null,
    `enrolled_modules` varchar(255)
);
-- 创建主键  ``是用来括着括号里可能存在的空格
-- 语法 alter table `` add primary key (``)
ALTER TABLE `teachers` add primary key (`id`); 
describe student;
alter table modules add primary key (`code`);
alter table student add primary key (id);

-- 创建外键
-- 语法： alter table ``  add constraint `` foreign key(``) references ``(``)
alter table modules -- 要插入外键的表
add constraint fk_moudle_teacher 
foreign key (`teacher_id`) -- 被插入表（moudles）的表头
references teachers(`id`); 
describe modules;

-- 插值 insert into `` values( , , ,)
insert into `teachers` values (6503399, 'John Drake', '12022017202020', 'SD-766');
insert into `modules` values ('HCI-101', 'Human Computer Interaction', 6503399);

insert into `teachers` values (7614411, 'Felicia Gomez', '1024', 'BES-207');
insert into `modules` values ('HSB', 'Haskell for Beginners', 7614411);

insert into `teachers` values (5899114, 'John Cartwright', '12345 ext 1212', 'BES-201');
insert into `modules` values ('MC1', 'Mathematics', 5899114);
select*from modules;

alter table student add
constraint fk_student_module foreign key (`enrolled_modules`)
references modules (code);

insert into student values(764411, 'Daryl', 'Daryl.Silly@birmmingham.ac.uk', 'MC1');
-- 目前只能一对一
-- insert into `student` values (764411, 'Daryl', 'Daryl.Silly@birmmingham.ac.uk', 'MC2');
create table activity
(
  `Activity name` Varchar(100) primary key,
  `student_id` int(6) not null,
  `Activity description` varchar(255),
  constraint fk_activity_studentactivity
  foreign key (`student_id`) references student(id)
);

-- alter table `student` drop primary key

