# Assignment 5 - Logistic Regression (Final Correct Version)

import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LogisticRegression
from sklearn.metrics import confusion_matrix, accuracy_score, precision_score, recall_score
from sklearn.preprocessing import StandardScaler

# -----------------------------
# 1. Create Larger Dataset
# -----------------------------
data = {
    'Age': [22,25,47,52,46,56,23,28,40,60,35,42,29,33,48,55],
    'Salary': [15000,29000,48000,60000,52000,80000,20000,30000,70000,90000,45000,62000,31000,40000,75000,85000],
    'Purchased': [0,0,1,1,1,1,0,0,1,1,0,1,0,0,1,1]
}

df = pd.DataFrame(data)

print("----- Dataset -----")
print(df)


# -----------------------------
# 2. Split Data (IMPORTANT FIX)
# -----------------------------
X = df[['Age', 'Salary']]
y = df['Purchased']

X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.2, stratify=y, random_state=42
)


# -----------------------------
# 3. Feature Scaling
# -----------------------------
scaler = StandardScaler()
X_train = scaler.fit_transform(X_train)
X_test = scaler.transform(X_test)


# -----------------------------
# 4. Train Model
# -----------------------------
model = LogisticRegression()
model.fit(X_train, y_train)


# -----------------------------
# 5. Prediction
# -----------------------------
y_pred = model.predict(X_test)


# -----------------------------
# 6. Confusion Matrix (2x2)
# -----------------------------
cm = confusion_matrix(y_test, y_pred, labels=[0,1])

print("\n----- Confusion Matrix -----")
print(cm)


# -----------------------------
# 7. Performance Metrics
# -----------------------------
accuracy = accuracy_score(y_test, y_pred)
precision = precision_score(y_test, y_pred)
recall = recall_score(y_test, y_pred)

print("\nAccuracy:", accuracy)
print("Precision:", precision)
print("Recall:", recall)
print("Error Rate:", 1 - accuracy)


# -----------------------------
# 8. Actual vs Predicted
# -----------------------------
result = pd.DataFrame({
    'Actual': y_test.values,
    'Predicted': y_pred
})

print("\n----- Actual vs Predicted -----")
print(result)
