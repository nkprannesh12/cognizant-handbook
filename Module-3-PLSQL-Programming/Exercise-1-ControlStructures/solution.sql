SET SERVEROUTPUT ON;

BEGIN
    FOR customer IN (SELECT CustomerID, DOB, Balance FROM Customers) LOOP

        IF MONTHS_BETWEEN(SYSDATE, customer.DOB) / 12 > 60 THEN

            UPDATE Customers
            SET Balance = Balance * 1.01
            WHERE CustomerID = customer.CustomerID;

            DBMS_OUTPUT.PUT_LINE('Discount applied to Customer ID: ' || customer.CustomerID);

        END IF;

    END LOOP;

    COMMIT;
END;
/

-- Scenario 2: Update loan interest for customers above 60 years

BEGIN
    FOR customer IN (SELECT CustomerID, DOB FROM Customers) LOOP

        IF MONTHS_BETWEEN(SYSDATE, customer.DOB) / 12 > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = customer.CustomerID;

            DBMS_OUTPUT.PUT_LINE('Interest updated for Customer ID: ' || customer.CustomerID);

        END IF;

    END LOOP;

    COMMIT;
END;
/

BEGIN

    FOR loan IN (SELECT LoanID, CustomerID, EndDate FROM Loans) LOOP

        IF loan.EndDate <= SYSDATE + 30 THEN

            DBMS_OUTPUT.PUT_LINE(
                'Reminder: Loan ID '
                || loan.LoanID
                || ' is due soon.'
            );

        END IF;

    END LOOP;

END;
/