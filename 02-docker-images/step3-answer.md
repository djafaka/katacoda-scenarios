<pre class="file" data-filename="Dockerfile" data-target="replace">
# Base image
FROM python:3-alpine

# Copy dependency definition first to use cache for dependencies
COPY requirements.txt /usr/src/app

# Install dependencies
RUN pip install --no-cache-dir -r requirements.txt

# Copy rest of the sources
COPY . /usr/src/app

# Suggest exposing port 5000
EXPOSE 5000

# As long as this command is run, the container is running
CMD ["python", "app.py"]
</pre>
