import pandas as pd
import numpy as np

# Load dataset (use your iris.csv)
df = pd.read_csv("D:\GitHub\JAVA\java_Full_Stack\Practical_six_sem\DSBDA\Assinment_no_3\iris.csv")
print("----- Dataset -----")
print(df.head())

# 1. Group by Species
grouped = df.groupby('species')

# 2. Summary Statistics
print("\n----- Mean -----")
print(grouped.mean())
print("\n----- Median -----")
print(grouped.median())
print("\n----- Min -----")
print(grouped.min())
print("\n----- Max -----")
print(grouped.max())
print("\n----- Standard Deviation -----")
print(grouped.std())

# 3. Percentile Example
print("\n----- Percentiles -----")
print(df.groupby('species').describe())

# 4. Individual Species Example
print("\n----- Iris Setosa Stats -----")
print(df[df['species'] == 'setosa'].describe())

print("\n----- Iris Versicolor Stats -----")
print(df[df['species'] == 'versicolor'].describe())

print("\n----- Iris Virginica Stats -----")
print(df[df['species'] == 'virginica'].describe())
