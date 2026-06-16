import matplotlib.pyplot as plt

data = [10, 20, 20, 30, 30, 30, 40]

plt.hist(data)

plt.xlabel("Values")
plt.ylabel("Frequency")

plt.title("Histogram")

plt.show()
