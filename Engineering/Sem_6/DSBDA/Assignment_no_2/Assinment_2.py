# Assignment No. 2 - Data Wrangling II

import pandas as pd
import numpy as np

# -----------------------------
# 1. Create Dataset (Sample Academic Data)
# -----------------------------
data = {
    'Name': ['A', 'B', 'C', 'D', 'E', 'F'],
    'Marks': [85, 90, None, 95, 200, 88],   # 200 = Outlier
    'Attendance': [90, None, 85, 88, 92, None]
}

df = pd.DataFrame(data)

print("----- Original Dataset -----")
print(df)


# -----------------------------
# 2. Check Missing Values
# -----------------------------
print("\n----- Missing Values -----")
print(df.isnull().sum())


# -----------------------------
# 3. Handle Missing Values
# -----------------------------
df['Marks'] = df['Marks'].fillna(df['Marks'].mean())
df['Attendance'] = df['Attendance'].fillna(df['Attendance'].mean())

print("\n----- After Handling Missing Values -----")
print(df)


# -----------------------------
# 4. Detect Outliers using IQR
# -----------------------------
Q1 = df['Marks'].quantile(0.25)
Q3 = df['Marks'].quantile(0.75)
IQR = Q3 - Q1

lower_limit = Q1 - 1.5 * IQR
upper_limit = Q3 + 1.5 * IQR

print("\nLower Limit:", lower_limit)
print("Upper Limit:", upper_limit)


# -----------------------------
# 5. Remove Outliers
# -----------------------------
df = df[(df['Marks'] >= lower_limit) & (df['Marks'] <= upper_limit)]

print("\n----- After Removing Outliers -----")
print(df)


# -----------------------------
# 6. Data Transformation (Normalization)
# -----------------------------
df['Marks'] = (df['Marks'] - df['Marks'].min()) / (df['Marks'].max() - df['Marks'].min())

print("\n----- After Normalization -----")
print(df)


# -----------------------------
# 7. Final Dataset
# -----------------------------
print("\n----- Final Cleaned Dataset -----")
print(df)