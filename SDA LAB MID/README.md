# Admission System

This repository contains a **Java-based Admission System** for **COMSATS University, Abbottabad Campus**. The system automates the admission process using the **Pipe and Filter** architecture combined with a **Layered Architecture**.

---

## 📌 Features

- **Eligibility Filter**: Filters applicants based on their academic percentage (minimum 50% required).
- **NTS Test Filter**: Filters applicants based on their NTS test score (minimum 60 out of 80 required).
- **Interview Filter**: Filters applicants based on their interview performance.
- **Notifications**: Sends appropriate notifications to applicants at each stage of the process.
- **Merit List**: Displays the names of applicants who pass all stages of the admission process.



## 💻 Technologies Used

- **Programming Language**: Java  
- **Design Pattern**: Pipe and Filter  
- **Architecture**: Layered Architecture  
- **IDE**: Visual Studio Code  

---

## ⚙️ How It Works

1. **Applicants**: A list of applicants is provided, including their names and academic percentages.
2. **Filters**:
   - **Eligibility Filter**: Filters applicants with a percentage >= 50%.
   - **NTS Test Filter**: Filters applicants with an NTS test score >= 60.
   - **Interview Filter**: Filters applicants who pass the interview.
3. **Notifications**:
   - Applicants are notified whether they pass or fail at every stage.
   - Successful applicants receive a congratulatory message.
   - Unsuccessful applicants are notified with encouragement to try again.
4. **Merit List**:
   - The names of applicants who pass all filters are displayed in the final merit list.

---

## 🚀 Example Output

```plaintext
Processing Applicants...

===== Applicant: Allayan Mughal =====
Academic Percentage: 55.0
Eligibility Status: Eligible
Notification: Congratulations! You are eligible to apply.
NTS Score: 60
NTS Test Status: Passed
Notification: You passed the NTS test.
Interview Status: Passed
Notification: You passed the interview.
Merit List Status: Included

===== Applicant: Hadi Raza =====
Academic Percentage: 45.0
Eligibility Status: Not Eligible
Notification: Better luck next time.

===== Final Merit List =====
Name: Allayan Mughal
