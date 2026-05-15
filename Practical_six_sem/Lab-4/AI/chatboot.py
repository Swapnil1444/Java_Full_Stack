# Advanced AI Chatbot in Python

import random
import datetime

# Bot Responses
responses = {
    "hello": [
        "Hello! How can I help you today?",
        "Hi there! Welcome!",
        "Hey! Nice to talk with you."
    ],

    "how are you": [
        "I am fine and working perfectly!",
        "Doing great! Thanks for asking.",
        "I'm good. How about you?"
    ],

    "your name": [
        "I am an AI Chatbot.",
        "You can call me SmartBot.",
        "My name is Customer Support Bot."
    ],

    "time": [
        f"Current Time is: {datetime.datetime.now().strftime('%H:%M:%S')}"
    ],

    "date": [
        f"Today's Date is: {datetime.datetime.now().strftime('%d-%m-%Y')}"
    ],

    "product": [
        "We provide laptops, mobiles, headphones, and smartwatches.",
        "Available products are electronics and accessories."
    ],

    "price": [
        "Prices depend on the product model.",
        "Please specify the product name for exact pricing."
    ],

    "delivery": [
        "Delivery usually takes 3-5 business days.",
        "Fast delivery service is available."
    ],

    "payment": [
        "We accept UPI, Debit Card, Credit Card, and COD.",
        "Online and offline payment methods are available."
    ],

    "refund": [
        "Refund will be processed within 7 working days.",
        "Refund policy is available on our website."
    ],

    "thanks": [
        "You're welcome!",
        "Happy to help!",
        "Anytime!"
    ],

    "bye": [
        "Goodbye! Have a great day!",
        "Thank you for visiting!",
        "See you again!"
    ]
}

# Chat History
chat_history = []

# Chatbot Function
def chatbot():

    print("=================================")
    print("   PROFESSIONAL AI CHATBOT")
    print("=================================")

    print("\nType 'bye' to exit.\n")

    while True:

        user_input = input("You: ").lower()

        chat_history.append("You: " + user_input)

        found = False

        # Check user message
        for key in responses:

            if key in user_input:

                bot_reply = random.choice(responses[key])

                print("Bot:", bot_reply)

                chat_history.append("Bot: " + bot_reply)

                found = True

                # Exit condition
                if key == "bye":
                    print("\nChat Ended.")
                    return

                break

        # Unknown Message
        if not found:

            unknown_responses = [
                "Sorry, I didn't understand that.",
                "Can you please explain more?",
                "I'm still learning. Please try another question."
            ]

            bot_reply = random.choice(unknown_responses)

            print("Bot:", bot_reply)

            chat_history.append("Bot: " + bot_reply)

# Run Chatbot
chatbot()

# Save Chat History
with open("chat_history.txt", "w") as file:

    for message in chat_history:
        file.write(message + "\n")

print("\nChat history saved in 'chat_history.txt'")