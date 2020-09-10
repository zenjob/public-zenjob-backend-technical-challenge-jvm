# Zenjob Coding Challenge

This is a __coding challenge__ intended for __backend engineers__. It holds __three different tasks__, with an additional __stretch goal__ if you are feeling adventurous. For finishing Tasks A, B and C with some documentation, you should not need to invest more than __3 hours__. If you want to take a shot at the stretch goal as well, it may take longer than that. 

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
* __shifts__ can only be at most 8 hours long;
* we do not want __talents__ to work less than 2 hours a __shift__;
* __talents__ are legally not allowed to work consecutive __shifts__, meaning there has to be at least a 6 hours break between __shifts__ for the same __talent__.

## Objective
Your job is to extend the existing service so it satisfies the following requirements:

**AS** a Company
I want to be able to cancel a job I ordered previously
**AND** if the job gets cancelled all shifts get cancelled as well

**AS** a Company
I want to be able to cancel a single shift of a job I ordered previously

**AS** a Company
I want to be able to cancel all shifts booked for a specific talent
**AND** if the shifts are cancelled there has to be a new shifts created as a substitute with a new talent

### Stretch goal
**AS** a Company
I want to be able to order for specific times rather than for a fixed one
