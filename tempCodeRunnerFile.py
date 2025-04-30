from PyPDF2 import PdfReader

# Load the uploaded PDF
pdf_path = (r"C:\\Users\\shash\\Downloads\\AI Lab Record.pdf")
reader = PdfReader(pdf_path)

# Extract text from all pages
all_text = ""
for page in reader.pages:
    all_text += page.extract_text() + "\n"

# Save the raw text content to analyze and parse further
text_dump_path = (r"C:\\Users\\shash\\Downloads\\AI Lab Record.pdf.txt")
with open(text_dump_path, "w", encoding="utf-8") as f:
    f.write(all_text)

text_dump_path
