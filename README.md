# Zenjob Coding Challenge

This is a __coding challenge__ intended for __backend engineers__. It holds __three different tasks__ with an additional __stretch goal__ if you feel adventures. For Task A-C including some documentation about what you did you should not need to invest more than __2-3 hours__. If you want to look at the stretch goal as well though it can get longer than that. 

## What this is about
This repository consists of a simplified version of Zenjob which allows __companies__ to order __jobs__ consisting of __shifts__ which __talents__ (this is how we call the workers) can be booked for.

### No bootstrapping needed
In order for you to be able to dive right into it, there is a simplified version of a job service provided which already contains the possibility for
* creating a job with multiple shifts, 
* fetching the shifts for a specific job and 
* booking a talent/person to a shift.

Feel free to adjust it as much as you like.

### Product boundary conditions
There are certain boundary conditions defined which __must__ be met by the service. So make sure that what ever you are delivering is meeting those requirements in the end.
* __jobs__ have to have at least one shift
* __shifts__ can only be at most 8 hours long
* we do not want __talents__ to work less than 2 hours a __shift__ so they make enough money on a single __shift__
* __talents__ are legally not allowed to work consecutive __shifts__ meaning there has to be at least a 6 hours break between __shifts__ for the same __talent__

## Your job
is to extend the existing service so it satisfies the requirements as following:

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
**AND** if the shifts are cancelled there has to be a new shifts created as a substitute with a new talent

### Stretch goal
**AS** a Company
I want to be able to order for specific times rather than for fixed once
