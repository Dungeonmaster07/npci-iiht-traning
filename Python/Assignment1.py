no_of_students=int(input("Enter the number of students: "))
physics_marks = int(input("Enter the marks of Physics: "))
maths_marks=int(input("Enter the marks of Maths: "))
chemistry_marks=int(input("Enter the marks of Chemistry: "))

for i in range (no_of_students):
    if physics_marks>50 and chemistry_marks>50 and maths_marks>50 : 
        print("Congratulations! You pass bruh..")
    elif physics_marks>50 and chemistry_marks>50 and maths_marks<=50:
        print("You pass but please re-appear for maths exam..")
    elif physics_marks>50 and chemistry_marks<=50 and maths_marks>50:
        print("You pass but please re-appear for chemistry exam..")
    elif physics_marks<=50 and chemistry_marks>50 and maths_marks>50:
        print("You pass but please re-appear for physics exam..")
    else:
        print("Sorry bruh You failed..Please study hard")