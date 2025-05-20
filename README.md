
# E-Commerce Platform with Stripe Payment Integration 🛒💳

This is a simple eCommerce platform built using **Spring Boot** for the backend, with a frontend designed using **HTML**, **CSS**, and **JavaScript**. The platform allows users to browse products, add them to the cart, and process payments securely through the **Stripe API**.

## Table of Contents 📚

- [Project Overview](#project-overview)
- [Prerequisites](#prerequisites)
- [Setup Instructions](#setup-instructions)
- [How to Use](#how-to-use)
- [Testing the Payment Flow](#testing-the-payment-flow)
- [Project Structure](#project-structure)
- [Key Components](#key-components)
- [Production Considerations](#production-considerations)
- [License](#license)

---

## Project Overview 📦

This project is designed to provide a basic e-commerce platform with:

- Product display: Showcasing products available for purchase.
- Secure checkout: Users can securely enter payment information.
- Payment processing: Payments are processed via the **Stripe API**.
- Success confirmation: After payment, users are shown a success page.

---

## Prerequisites 🛠️

Before you start, you will need to have the following installed:

- **Java 17 or higher**: This project uses Spring Boot, which requires Java 17 or above.
- **Maven**: The build tool used to manage dependencies and run the project.
- **Stripe Account**: If you don't already have a Stripe account, create one for free [here](https://stripe.com).

---

## Setup Instructions 🚀

### Step 1: Get Your Stripe API Keys 🔑

1. Log in to your **Stripe Dashboard**.
2. Navigate to **Developers → API keys**.
3. Copy your **Publishable key** and **Secret key**.

### Step 2: Configure Stripe API Keys 🔧

- In your project, navigate to `src/main/resources/application.properties`.
- Add your Stripe keys like so:

```properties
stripe.api.key=sk_test_your_secret_key_here
stripe.public.key=pk_test_your_publishable_key_here
```

### Step 3: Build and Run the Application 🏗️

1. **Clean and Install** dependencies:
   ```bash
   mvn clean install
   ```

2. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```

---

## How to Use 👩‍💻👨‍💻

Once the application is running, you can access it via your browser.

1. Open your browser and go to [http://localhost:8080](http://localhost:8080).
2. You'll see the homepage with product listings. Browse through the products, and click on any of the **"Buy Now"** buttons to initiate the checkout process.

---

## Testing the Payment Flow 💳

1. **Click on "Buy Now"** for any product.
2. You will be redirected to the checkout page where you can enter your payment details.
3. **Use the following test card details** for testing:

    - **Card number**: `4242 4242 4242 4242`
    - **Expiry date**: Any future date
    - **CVC**: Any 3 digits
    - **ZIP**: Any 5 digits

4. Click on **"Pay Now"** to simulate a payment.
5. If the payment is successful, you'll be redirected to a **success page**.

---

## Project Structure 📁

### Backend (Spring Boot)

- **Controllers**: Handles HTTP requests from the frontend.
- **Services**: Contains business logic related to payment processing and product management.
- **Models**: Data structures representing products and payment details.
- **Config**: Configuration classes for Stripe.

### Frontend

- **HTML Templates**: Rendered with **Thymeleaf** for dynamic content.
- **CSS**: Used for styling the website.
- **JavaScript**: Handles Stripe payment integration and other frontend interactions.

---

## Key Components 🔑

1. **Product Display**: A section of the homepage where users can view available products.
2. **Checkout Process**: A secure form where users can enter their payment information.
3. **Payment Processing**: The logic that interacts with the Stripe API to process payments.
4. **Success Confirmation**: A page displayed to users after a successful payment, confirming the transaction.

---

### Feel free to contribute! 🎉

If you'd like to contribute to the project, feel free to submit pull requests or open issues. Contributions are always welcome!


