
<h1 align="center">Job_Search_Portal</h1>

>## Framework Used 
 * SpringBoot

>## Language Used
* Java

>## Data Structure used in my project
   This project uses the following data structures:-
   Job:- A model class that represents a job listing, with attributes such as id, title, description, location, salary, companyName, employerName, jobType (an enum class that represents job categories such as IT, HR, Sales, Marketing), and appliedDate.

      
>## 1.Controller-
* JobController - exposes REST endpoints for creating, updating, deleting, and searching jobs.
        Service:
>## 2. Service-
* JobService - implements business logic for validating inputs, performing search queries, and executing CRUD operations.
        Repository:
>## 3. Repository
* IJobRepository - defines interface for data access operations on the Job entity. 
* IJobRepository extends CrudRepository.
  
>## 4. Model
1.Job-
* Job table with columns:
id (Long)
,title (String)
,description (String)
,location (String)
,salary (Double)
,companyName (String)
,employerName (String) 
,jobType (String)
appliedDate (LocalDate).

2.JobType(Enum class)- IT,HR ,Sales, Marketing
                  
>## Project Summary
1.crud operations using inbuilt @CrudRepo methods,

2.custom get methods using your own custom finders (No implementations, correct queries should be fired based on method names)

3.write operations (update and delete) using Custom queries (using @Query) 
         
