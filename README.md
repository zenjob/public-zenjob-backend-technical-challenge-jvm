# Backend Challenge

This is a coding challenge for backend engineers. It holds different expectation levels with an additional stretch goal.

## The instructions
This repository consists of a simplified job service which allows users (so called talents) to be booked for jobs.

### Product boundary conditions
* jobs have at least one shift

* shifts can only be at most 8 hours long
* we do not want talents to work less than 2 hours a shift so they make enough money on a single shift

* talents are legally not allowed to work consecutive shifts meaning there has to be at least a 6 hours break between shifts for the same talent

### Provided
Provided is a simplified application which already contains the possibility of creating a job with multiple shifts, fetching the shifts for a specific job and booking a talent/person to a shift.
Feel free to adjust it as much as you like.

# Requested extensions

### Junior
* AS a Company
I want to be able to cancel a job I ordered previously
AND if the job gets cancelled all shifts get cancelled as well

### Mid
* AS a Company
I want to be able to cancel a single shift of a job I ordered previously

### Senior
* AS a Company
I want to be able to cancel all shifts booked for a specific talent
AND if the shifts are cancelled there has to be a new shifts created as a substitute with a new talent

### Stretch goal
* AS a Company
I want to be able to order for specific times
