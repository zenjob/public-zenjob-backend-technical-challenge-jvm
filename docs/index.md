# Zenjob Coding Challenge

This is a **backend coding challenge**, containing **three different tasks**. The repository consists of a simplified version of Zenjob's platform:

- *Companies* can order *jobs*
- Each *job* contains one or more *shifts*
- *Talents* (workers) can be booked for *shifts*

### No bootstrapping needed

To allow you to dive right into it, there is a simplified version of a job service provided, which already contains the following features:

- Creating a *job* with multiple shifts
- Fetching the *shifts* for a specific *job*
- Booking a *talent* to a *shift*

Feel free to adjust it as much as you like.

### Product boundary conditions

There are certain boundary conditions defined which **must** be met by the service.

- A *job* should have at least one *shift*
- The start date of a *job* cannot be in the past
- The end date of a *job* should be after the start date
- A *shift*'s length should equal to 8 hours

### Out of scope

In order to keep the scope reasonably sized, there is no possibility for a company to request jobs for specific times.

## Objective

Your job is to modify the existing service so it satisfies the following requirements:

### Task A

- **AS** a *company*
- **I CAN** cancel a *job* I ordered previously
- **AND** if the *job* gets cancelled all of its *shifts* get cancelled as well

### Task B

- **AS** a *company*
- **I CAN** cancel a single *shift* of a job I ordered previously

### Task C

- **AS** a *company*
- **I CAN** cancel all of my shifts which were booked for a specific talent
- **AND** replacement shifts are created with the same dates

## Evaluation criteria

Your submission will be evaluated by at least 2 people on the following criteria:

- Completeness
- API design
- Tests
- Solution design
- Code styling

## Final notes

If you have any questions, feel free to reach out to us at any time.
