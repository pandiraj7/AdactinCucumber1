Feature: Hotel Booking In Adactin Application

Scenario: User Login In Web Application
Given User Launch The Adactin Application
When User Enter The Username In The User Field
And User Enter The Password In The Password Field
Then User Click The Login Button And Page As Navigate's To Search Hotel Page

Scenario: User Search For Hotel
When User Choose The Location From Location List
And User Select The Hotel In Hotel List
And User Select RoomType In RoomType List
And User Select The Number Of Rooms In Number Of Rooms List
And User Enter The Check In Date In Check In Box
And User Enter The Check Out Date In Check Out Box
And User Select The Number Of Aduld Per Room In Aduld Per Room Field
And User Select The Children Per Room In Children Per Room Field
Then User Click Search Button And It Navigate To Select Hotel Page

Scenario: User Select Hotel
When User Click The Hotel Conforming Page 
Then User Click The Continue Button And It Navigate To Book Hotel Page

Scenario: User Book The Hotel
When User Enter The FirstName In FirstName Field
And User Enter The LastName In LastName Field
And User Enter The User Billing Address In Billing Address Field
And User Enter The Credit Card No In Credit Card No Field
And User Select The Credit Card Type In Credit Card Type List
And User Select The Expire Month And Expire Year In Expire Date Field
And User Enter The CVV Number in CVV Number Field
Then User Click The BookNow Button And It Navigate To 

Scenario: User Logout From Page
Then User Click The Logout Button And It Navigate To Logout SuccessFully Page

