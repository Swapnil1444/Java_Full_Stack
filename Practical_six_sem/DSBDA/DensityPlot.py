import seaborn as sns
import matplotlib.pyplot as plt

data = [10, 20, 20, 30, 30, 30, 40]

sns.kdeplot(data)

plt.title("Density Plot")

plt.show()
