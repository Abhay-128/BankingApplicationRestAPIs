# BankingApplicationRestAPIs

BankingApplicationRestAPIs is a Spring Boot-based RESTful service that allows you to perform operations related to banking accounts such as creating new accounts, depositing and withdrawing funds, and querying account details.

## Features

- ✅ Create new bank accounts.
- 💰 Deposit funds into an account.
- 💸 Withdraw funds from an account.
- 📖 View account details.
- 📋 List all accounts.

## How to Use 🛠️

To use these APIs, send HTTP requests to the following endpoints:

- `POST /api/accounts` - Create a new account.
- `PUT /api/accounts/{id}/deposit` - Deposit funds into an account.
- `PUT /api/accounts/{id}/withdraw` - Withdraw funds from an account.
- `GET /api/accounts` - List all accounts.
- `GET /api/accounts/{id}` - Get details for a specific account.

## Create a new account.
![Create new account](images/PostRequest.png)
## Deposit funds into a account
![deposit funds into an account](images/deposit.png)
## Withdraw funds from an account
![withdraw funds from account](images/withdraw.png)
## List all accounts
![List all accounts](images/getAllAccounts.png)
## Get details for specific account.
![View Account Details](images/GetByIdRequest.png)


