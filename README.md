# Zenjob Coding Challenge

This is a coding challenge intended for backend engineers. It holds three different tasks. For finishing the main tasks with some documentation, you should not need to invest more than __2 hours__.

## What this is about
This repository consists of a simplified version of Zenjob's platform, which allows __companies__ to order __jobs__ consisting of __shifts__ that __talents__ (workers) can be booked for.

### No bootstrapping needed
To allow you to dive right into it, there is a simplified version of a job service provided, which already contains the following features:
* creating a job with multiple shifts;
* fetching the shifts for a specific job;
* booking a talent to a shift.

Feel free to adjust it as much as you like.

### Product boundary conditions
There are certain boundary conditions defined which __must__ be met by the service.
* __jobs__ have to have at least one shift;
* __shifts__ should be 8 hours long;

In order to keep the scope reasonably sized, there is no possibility for a company to book specific times right now.

## Objective
Your job is to extend the existing service so it satisfies the following requirements:

### Task A
**AS** a Company
I want to be able to cancel a job I ordered previously
**AND** if the job gets cancelled all shifts get cancelled as well

### Task B
**AS** a Company
I want to be able to cancel a single shift of a job I ordered previously

### Task C
**AS** a Company
 I want to be able to cancel all shifts booked for a specific talent
 **AND** if the shifts are cancelled there has to be new shifts created as substitutes
