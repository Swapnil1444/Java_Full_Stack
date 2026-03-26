 # 1. Import Libraries
import pandas as pd
import numpy as np

# 2. Load Dataset
df = pd.read_csv("D:\GitHub\JAVA\java_Full_Stack\Practical_six_sem\DSBDA\Assinment_no_1\iris.csv")

# 3. Display Dataset
print(df.head())

# 4. Dataset Information
print(df.info())

# 5. Check Missing Values
print(df.isnull().sum())

# 6. Statistical Summary
print(df.describe())

# 7. Data Type Conversion (if needed)
# Example:
# df['column_name'] = df['column_name'].astype('int')

# 8. Convert Categorical to Numerical
df['species'] = df['species'].astype('category')
df['species'] = df['species'].cat.codes

print(df.head())