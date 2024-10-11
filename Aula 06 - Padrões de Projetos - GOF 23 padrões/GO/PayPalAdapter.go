package main

import "fmt"

// Interface Payment
type Payment interface {
    Pay(amount float64)
}

// StripePayment implementa a interface Payment
type StripePayment struct{}

func (s *StripePayment) Pay(amount float64) {
    fmt.Printf("Pagamento de $%.2f via Stripe processado.\n", amount)
}

// PaypalPayment tem uma interface diferente
type PaypalPayment struct{}

func (p *PaypalPayment) SendPayment(amount float64) {
    fmt.Printf("Pagamento de $%.2f via PayPal processado.\n", amount)
}

// PaypalAdapter adapta PaypalPayment para a interface Payment
type PaypalAdapter struct {
    paypal *PaypalPayment
}

func (p *PaypalAdapter) Pay(amount float64) {
    p.paypal.SendPayment(amount)
}

// Função de processamento de pagamento
func processPayment(paymentSystem Payment, amount float64) {
    paymentSystem.Pay(amount)
}

func main() {
    stripe := &StripePayment{}
    paypal := &PaypalPayment{}
    paypalAdapter := &PaypalAdapter{paypal}

    processPayment(stripe, 100)          // Pagamento via Stripe
    processPayment(paypalAdapter, 200)   // Pagamento via PayPal adaptado
}
