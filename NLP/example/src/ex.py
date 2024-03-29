from transformers import pipeline
import pandas as pd
text = """Dear Amazon, last week I ordered an Optimous Prime action figure from your online store in Germany. Unfortunately, when I opened the package, I discovered to my horror that I had been sent an action figure of Megatron instead! As a lifelong enemy of the Decepticons,  hope you can understand my dilema. To resolve the issue, I demand an exchange of Megatron for the optimous Prime figure I ordered. Enclosed are copies of my records concerning this purchase. I expect to hear from you soon. Sincerely, Bumblebee"""

classifier = pipeline("text-classification")
outputs = classifier(text)
pd.DataFrame(outputs)