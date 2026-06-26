Button addBtn = findViewById(R.id.addBtn);
EditText num1 = findViewById(R.id.num1);
EditText num2 = findViewById(R.id.num2);
TextView result = findViewById(R.id.result);

addBtn.setOnClickListener(v -> {
    double a = Double.parseDouble(num1.getText().toString());
    double b = Double.parseDouble(num2.getText().toString());
    result.setText("Result: " + (a + b));
});
