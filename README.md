# Company Levels

This project is built under at least 4 Design Patterns. They are the following:
- Builder
- Observer
- State
- Strategy

Everything is about how a company act regarding to some changes in code execution time.

It's possible to **Build** a company by instancing a new _CompanyBuilder_ and giving to it some attributes, whose are resposible for change the **State** and the **Strategy** of the Company.

By running into the code, we also have the **Observer** that is called when some _State_ changes.


For a real example, let's start with a sample:

A Company with a trade mark called `Bawi` has a number of employees of `15` and the most income of its financial comes from the `announces` of its marketing.
At this point the system says that this company is on a _Startup State_, because the number of employees in it, it reveals the level of the company, whose are the following:

When a company has at least:
- 89 employees, it is on a _Startup State_ and it has
    - Support via web chat
    - Auditorship for few days
    - Some negative balance
- between 89 and 490 employees, it is on an _Enterprise State_ and it has
    - Support also via bot application
    - Auditorship for few weeks
    - Some bonus in balance
- 490 or more employees, it is on a _Multinational State_ and it has
    - Support via all kind of communication
    - Auditorship in full time
    - Always increasing its balance
    
The _State_ also _notifies_ kinds of interested areas for the company, such as:

When a company is on a state called:
- Startup, it notifies:
    - the Staff
- Enterprise, it notifies:
    - the Staff
    - the Entire Company
- Multinational, it notifies:
    - the Staff
    - the Entire Company
    - the Communication Media

The _Strategy_ comes like an attribute of the company settled in the _Builder_.

When a company has a Stratey:
- _Announce_, its most income is from the announcement of its trademark.
- _Invest_, its most income is from the investments of the company.

All the project is based on a kind of study of cases to use some Object-oriented Patterns.
