The project consists of two main components: a Controller and a Service.

The Controller handles HTTP requests and defines two endpoints:

/uah/{amount}: A GET request that accepts the amount in UAH format and returns the calculation result in vp (Valorant Points, the in-game currency). /usd/{amount}: A GET request that accepts the amount in USD format and returns the calculation result in vp. Dependency injection is used in the Controller to obtain an instance of the CalculatorService, which is responsible for performing the calculations.

The Service (CalculatorService) contains two methods:

getUSD: It takes the amount in USD and performs the calculation based on specific conditions and formulas. It returns the calculation result as a BigDecimal object. getUAH: It takes the amount in UAH and performs the calculation using conditions and formulas as well. It returns the calculation result as a BigDecimal object. Both methods check the conditions on the input data and return -1 if the amount doesn't meet the requirements. Otherwise, they return the calculation result.

The code also utilizes logging using the Log4j library to record information about request execution and calculation results.

Overall, this project demonstrates a simple RESTful web service example that provides an API for calculating values of an in-game currency based on given amounts.
