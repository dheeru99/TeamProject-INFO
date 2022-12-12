This project is named as “InNeed” which is helpful for new immigrants like visitors, international students etc help with their basic need such as SIN (Social Insurance Number) application and approvals, Bank account openings and deposits, Tax claims at the year end for an individual earnings and also Emergency Incident management where user can report incidents for Fire, Medical and police incidents to the emergency unit. This project is an ecosystem with 5 major enterprises, 13 organizations, 24 roles and 6 work requests which operate inner and inter organizations. All the above mentioned things are explained in detail with their operation and limitations below

Ecosystem:
• The ecosystem has a networks with enterprise directory with all the information of the enterprise.
• This ecosystem will the starting point of the whole system and parts in it.
Enterprise:
• This system has five enterprises which has its own roles and work flow.
• Each enterprise has its own organisations which makes the work flow easier.
• Indeed, Sin Unit, Banking Unit, tax unit and emergency unit are the different enterprises in this project
Indeed Enterprise:
• This Indeed Unit is like a bridge between all the enterprises and the user who can raise work requests.
• This has User directory which stores all the information about the user and his operations in the system.
• There are four organizations under this enterprise which are InNeedSin, InNeedNBanking, InNeedtax, InNeedIncident organization.
• There is a role system amdin with four sub roles who will the able too access the above mentioned four organizations respectively.
User:
• The user can register for the inNeed application if he is not a registered user.
• To register for InNeed the user should have a valid SIN number to successfully get registered and login in to his portal.
• Once registered the user can login into portal where he can access the above four organizations to raise service requests.
• If the user forgets the password he can use the forgot password option where an OTP will be sent to registered email and with the help of the otp he can reset the password and login into his portal.
• The user can raise the below five work requests as part of his services obtained.
 User sin request – to apply for new SIN
 User bank account request – to open new account
 User tax claim request – to raise new claim request
 Emergency report request – to report an incident
 Fine payment request – to pay fine for false incident report
InNeedSin Organization:
• This organization will have a role named sinsystem admin who forwards the SIN application by user to SIN Unit for further process of the request.
• This role will have the option to reject the SIN request by user and also to forward the application to SIN Unit but not to approve.
InNeed Banking Organization:
• This organization will have a role named bankingsystem admin who forwards the bank account opening application by user to banking Unit for further process of the request.
• This role will have the option to reject the request by user and also to forward the application to banking Unit but not to approve.
• The user can open an account in 4 different banks namely CIBC, RBC, TD, Scotia bank.
• The user can open only one account in each bank.
InNeed Tax Organization:
• This organization will have a role named Taxsystem admin who forwards the tax claim request by user to tax Unit for further process of the request.
• This role will have the option to reject the request by user and also to forward the application to tax Unit but not to approve.
• If the user needs to raise a tax claim request, the user must have at least one account in one of the above mentioned banks.
InNeed Incident Organization:
• This organization will have a role named Incidentsystem admin who forwards the incident reported by user to Emergency Unit for further process of the request.
• This role will have the option to forward the application to SIN Unit but not to approve.
SIN Enterprise:
• This enterprise will have a directory which can store all the data processed under this enterprise.
• This will have SIN organization with two roles namely SIN officer and employee to process the request raised by user through InNeed application and to work on requests forwarded by the respective admin
from InNeed enterprise.
• The SIN officer will have the ability to assign the request to one of the employee in the organization and also will have the option to reject the application.
• The Employee will have option to approve the SIN request and provide the SIN to user.
• Every time when an employee approves a request, the user will get an email mentioning the request is approved along with the uniquely generated SIN number.
• Also the user will get an email notification if the request is rejected by SIN officer.

Banking Enterprise:
• This enterprise will have a directory which can store all the data processed under this enterprise.
• This enterprise will have four organizations individually for four banks.
• Each Banking organization with two roles namely bank officer and employee to process the request raised by user through InNeed application and to work on requests forwarded by the respective admin from InNeed enterprise.
• The bank manager will have the ability to assign the request to one of the employee in the organization and also will have the option to reject the application.
• The Employee will have option to approve the account opening request raised by user.
• Each bank will have its own managers and employees.
• Every time when an employee approves a request, the user will get an email mentioning the request is approved along with the uniquely generated account number.
Tax Enterprise:
• This enterprise will have a directory which can store all the data processed under this enterprise.
• This will have tax organization with two roles namely SIN officer and employee to process the request raised by user through InNeed application and to work on requests forwarded by the respective admin from InNeed enterprise.
• The tax officer will have the ability to assign the request to one of the employee in the organization and also will have the option to reject the application.
• The Employee will have option to approve the tax claim request.
• Every time when an employee approves a request, the user will get an email mentioning the request is approved.
• Also the user will get an email notification if the request is rejected by tax officer.
Emergency Enterprise:
• This enterprise will have a directory which can store all the data processed under this enterprise.
• This will have emergency organization with roles of three officers namely police, hospital and fire officer. These officers will have their respective employees to process the reports raised by user through InNeed application and to work on reports forwarded by the respective admin from InNeed enterprise.
• The above officers will have the ability to assign the request to one of the employee in the organization.
• The Employee will have option to investigate and approve the report.
• After investigation of the report if the employee finds the incident reported as fake then the officer will reject the report by imposing a fine on the user who reported the incident.
• This imposing of fine is another work request done by any of the emergency officer.
• Every time when an employee approves a report, the user will get an email mentioning that the report is true and appropriate action has been taken.
• Also the user will get an email notification if the report is fake and got rejected mentioning a particular fine is imposed for reporting a false incident.
• The fine mentioned can be paid by the user from any one of the bank account he has form banking enterprise.
