export interface UserDTO {

  username?:String;
  firstname?:String;
  lastname?:String;
  email?:String;
  roles:String[];
  approved:boolean;
  creationDate:Date;
  updateDate:Date;
  //   Byte[] image;
  // List<ApartmentDTO> myApartments;
  // List<ReviewDTO> reviews;
  // List<BookInfoDTO> bookings;
}
